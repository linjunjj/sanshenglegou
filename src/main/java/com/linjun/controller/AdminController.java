package com.linjun.controller;

import com.github.pagehelper.PageHelper;
import com.linjun.common.JsonResult;
import com.linjun.entity.PageBean;
import com.linjun.model.*;
import com.linjun.pojo.GoodsListAdmin;
import com.linjun.pojo.OrderData;
import com.linjun.pojo.OrderListAdmin;
import com.linjun.pojo.UserData;
import com.linjun.service.*;
import com.qiniu.util.Json;
import org.mapstruct.TargetType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    @Autowired
    AdminService adminService;
    @Autowired
    StoreService storeService;
    @Autowired
    UserService userService;
    @Autowired
    OrderService orderService;
    @Autowired
    OrderDetailService orderDetailService;
    @Autowired
    GoodsService goodsService;
    @Autowired
    AddressMongerService addressMongerService;
    @Autowired
    GoodsImageService goodsImageService;
    @Autowired
    GoodsTypeService goodsTypeService;
    @Autowired
    LogisticsService logisticsService;
    @Autowired
    GoodsDetailService goodsDetailService;

//    管理员登入
    @GetMapping(value = "/login")
    public JsonResult login(@RequestParam(value = "admin",required = false)String admin,
                            @RequestParam(value = "passworld",required = false)String passworld){
        Admin admin1=new Admin();
        admin1.setAccount(admin);
        admin1.setPassworld(passworld);
        try {
            Admin admin2 = adminService.login(admin1);
            return  new JsonResult("200",admin2);
        }catch (Exception e){
            return  new JsonResult("500",e.getMessage());
        }

    }
//    得到所有用户列表
    @GetMapping(value = "/getUserAll")
    public JsonResult getUserAll(@RequestParam(value = "page",required = false)int page,@RequestParam(value = "pageszie")int pagesize){
        try{
            PageBean<User> listall=userService.findUserList(page,pagesize);
            return new JsonResult("200",listall);
        }catch (Exception e){
            return new JsonResult("500",e.getMessage());
        }
    }
//    获取所用用户的概览图数据
    @GetMapping(value = "/getUserAllImage")
    public  JsonResult getUserAllImage(){
        try{
            UserData userData=new UserData();
            long userall=userService.countUser();
             long nowuser=userService.countUserNew();
             List<Integer>  workuser =userService.nowWeekuser();
             List<Integer>  monthuser=userService.nowMonthUser();
             userData.setAlluser(userall);
             userData.setNewuser(nowuser);
             userData.setWeekUser(workuser);
             userData.setMonthUser(monthuser);
       return  new JsonResult("200",userData);

        }catch (Exception e){
         return  new JsonResult("500",e.getMessage());
        }
    }
//   获取所有的店家列表
    @GetMapping(value = "/getStoreAll")
    public  JsonResult getStoreAll(@RequestParam(value = "page")int page,@RequestParam(value = "pagesize")int pagesize){


        try{
            PageBean<Store> list=storeService.findAllStore(page,pagesize);
            return  new JsonResult("200",list);
        }catch (Exception e){
            return  new JsonResult("500", e.getMessage());
        }
    }

//    获取所有商品
    @GetMapping(value = "/getGoodsAll")
    public JsonResult getGoodsAll(@RequestParam(value = "page")int page,@RequestParam(value = "pagesise")int pagesize){
            PageBean<Goods> goodslist=goodsService.goodsAll(page,pagesize);
            List<GoodsListAdmin> list=new ArrayList<GoodsListAdmin>();
            try{
                for (Goods data:goodslist.getList()) {
                  GoodsListAdmin admindata=new GoodsListAdmin();
                  admindata.setGoodsname(data.getGoodsname());
                  admindata.setId(data.getId());
                  admindata.setGoodsSum(data.getGoodssum());
                  admindata.setIsstart(data.getIsstart());
                  admindata.setMarketPrice(data.getMarketprive());
                  admindata.setMemberPrice(data.getMemberprice());
                  admindata.setSoldamount(data.getSoldamount());
                  admindata.setStoreid(data.getStoreid());
                  admindata.setStorename(storeService.findByid(data.getId()).getStorename());
                  admindata.setStorer(storeService.findByid(data.getId()).getStorer());
                  String a=null;
                  try{
                      a=goodsImageService.findMainImage(data.getId()).getIamgeaddress();
                  }catch (Exception e){
                      a=null;
                  }
                  admindata.setGoodsimage(a);
                  admindata.setTypeName(goodsTypeService.findById(data.getId()).getTypename());
                    SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                    admindata.setCreateTime(df.format(data.getCreatetime()));
                    list.add(admindata);
                }
                return new JsonResult("200",list);


            }catch (Exception e){
             return  new JsonResult("500",e.getMessage());
            }
    }


// 得到所有订单
 @GetMapping(value = "/getOrderAll")
    public  JsonResult getOrderAll(
         @RequestParam(value = "page",required = false)int page,
         @RequestParam(value = "page",required = false)int pagesize
 ){

          PageBean<Order> orderList=orderService.findAllOrder(page,pagesize);
          List<OrderListAdmin> list=new ArrayList<OrderListAdmin>();
     try{
         for (Order data:orderList.getList()) {
             OrderListAdmin orderListAdmin=new OrderListAdmin();
             orderListAdmin.setGoodsName(data.getGoodsname());
             orderListAdmin.setAcount(data.getGoodsum());
             orderListAdmin.setAddress(addressMongerService.findByUseridDefault(data.getUserid()).getAddressdetail());
             orderListAdmin.setAllPrice(data.getPricesum());
             SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

             orderListAdmin.setCreateTime(df.format(data.getPaytime()));
             orderListAdmin.setOrderCode(data.getOrdercode());
             int a=userService.findByID(data.getUserid()).getRole();
             if (a==1){
                 orderListAdmin.setPrice(data.getMemberprice());
             }else {
                 orderListAdmin.setPrice(data.getMarketpricce());
             }
             orderListAdmin.setRevierPeople(addressMongerService.findByUseridDefault(data.getUserid()).getReceivepeople());
             orderListAdmin.setTel(addressMongerService.findByUseridDefault(data.getUserid()).getReceivetel());
             orderListAdmin.setId(data.getId());
             orderListAdmin.setStorer(storeService.findByid(data.getUserid()).getStorer());
             orderListAdmin.setStoreid(data.getUserid());
             orderListAdmin.setStatus(data.getIspay());
              list.add(orderListAdmin);
         }
          return new JsonResult("200",list);
      }catch (Exception e){
          return  new JsonResult("500",e.getMessage());
      }
 }
//    订单概览
    @GetMapping(value = "/getOrderImage")
    public  JsonResult getOrderImage(){
      try{
          OrderData orderData=new OrderData();



    return  new JsonResult("200","");
      }catch (Exception e) {
       return  new JsonResult("500",e.getMessage());
      }
    }







//  获得所有店铺
    @GetMapping(value = "/getStore")
    public  JsonResult getStore(
            @RequestParam(value = "page",required = false)int page
    ){
        try {
//            PageHelper.startPage(page,2);
//            List<Store> storeList=storeService.findAll();


            return  new JsonResult("200",storeService.findAllStore(page,2));
        }catch (Exception e){
            return  new JsonResult("500",e.getMessage());
        }
    }
   @GetMapping(value = "/getstorelist")
    public  JsonResult getstorelist(){
       List<Store> stores=storeService.findAll();
       return  new JsonResult("200",stores);
   }


}
