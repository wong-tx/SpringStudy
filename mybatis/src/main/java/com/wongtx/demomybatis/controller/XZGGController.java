package  com.wongtx.demomybatis.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.wongtx.demomybatis.entity.UserInfoDTO;
import com.wongtx.demomybatis.entity.XZGG;
import com.wongtx.demomybatis.service.XZGGService;
import com.wongtx.demomybatis.service.impl.XZGGServiceimpl;
import com.wongtx.demomybatis.vo.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




/**
 * @author wongtx
 * @version 1.0
 * @date 2020/6/3 16:11
 */
@RestController
public class XZGGController {
    @Autowired
    XZGGService xzggService;

    @Autowired
    XZGGServiceimpl xzggServiceimpl;

    @PostMapping("/xzggjy.do")
    public XZGG save() {
//        User user = new User();
//        user.setUserMsg("从此不敢看观音");
//
//        Role role = new Role();
//        role.setUserTeacher("ZSWW");
//        XZGG xzgg = xzggService.save(user, role);
//        XZGG xzgg = xzggService.find(4);

//        List list1 = null;
//        try {
//            List list = xzggService.findbyId(9);
//            list1 = xzggService.findbyId(4);
//            Iterator rows = list1.iterator();
//            Object next = rows.next();
//            boolean b = rows.hasNext();
//            if (list.isEmpty()){
//                System.err.println("xz");
//            }
//            if (list.size() != 0) {
//                System.err.println("xzgg");
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        int i = xzggService.findmsg("从此不敢看观音");
//        if (i > 0) {
//            System.err.println("出来了！");
//        }
//        Map<String, Object> map = xzggService.findMap(9);
//        if (map == null|| map.isEmpty()){
//            System.err.println("是空的！");
//        }
//
//        int id = (int)map.get("id");
//        xzgg.setId(id);

//        List<Map<String, Object>> list = xzggService.findMap("从此不敢看观音");
//        List<XZGG> objects = new ArrayList<>();
//        for (Map<String, Object> map : list) {
//            XZGG xzgg = new XZGG();
//            xzgg.setId((int)map.get("id"));
//            xzgg.setMsg(map.get("msg").toString());
//            xzgg.setCp(map.get("cp").toString());
//            xzgg.setCreateDate((Date) map.get("createDate"));
//            objects.add(xzgg);
//        }
        XZGG xz = new XZGG();
//        xz.setMsg(JSON.toJSONString(objects));
xz.setMsg(xzggServiceimpl.ces());
        return xz;
    }

    @PutMapping("/lianghzhu.do")
    public R updateMsg(){
//        int i = xzggService.updaateMsg();
        int i = xzggService.findCount();

        if (i > 0) {
            return R.setOK();
        }
        return R.setERROR("失败");

    }

    @PostMapping("/zsww.do")
    public R testEntity(){
//        int i = xzggService.saveEntity();
//        int entity = xzggService.updateEntity();
//        if (i > 0 && entity > 0) {
//            return R.setOK();
//        }
//                List<Map<String, Object>> list = xzggService.findMap("f");
//        List list = xzggService.findCp("ZSWW");
//        if (list.isEmpty()){
//                    return R.setOK();
//                }
//        List<XZGG> list = new ArrayList<>();
//        XZGG xzgg = new XZGG();
//        xzgg.setCp("zsww");
//        xzgg.setMsg("杯夏");
//        XZGG xzgg1 = new XZGG();
//        xzgg1.setMsg("仲夏之月");
//        xzgg1.setCp("lsfy");
//        XZGG xzgg2 = new XZGG();
//        xzgg2.setCp("bjyx");
//        xzgg2.setMsg("斯塔万格");
//        list.add(xzgg);
//        list.add(xzgg1);
//        list.add(xzgg2);
//        int insert = xzggService.insert(list);
//        if (insert > 0){
//            return  R.setOK();
//        }
//        List list = xzggService.list();
//        if (list.isEmpty()){
//            return  R.setOK();
//        }
//        int upda = xzggService.upda(7);
//        XZGG xzgg = new XZGG();
//        xzgg.setMsg("残夏");
//        xzgg.setCp("zsww");
//
//        xzgg.setId(11);
//        int i = xzggService.insertEntity(xzgg);
//        if (i > 0){
//            return R.setOK();
//        }
//        return R.setERROR();

//        List list = xzggService.findAllObject();
//        for (Object o : list) {
//
//        }
        StringBuilder sql = new StringBuilder();
        sql.append("select id,cp,msg,createDate from xzgg where create  < '2020-06-05 10:30:17'");
//        List<SqlRowSet> cesqubie = xzggService.cesqubie(sql.toString());
//
        List<XZGG> list = new ArrayList<>();
//        for (SqlRowSet sqlRowSet : cesqubie) {
//            XZGG xzgg = new XZGG();
//            xzgg.setCreateDate(sqlRowSet.getDate("creatDate"));
//            xzgg.setMsg(sqlRowSet.getString("msg"));
//            xzgg.setCp(sqlRowSet.getString("cp"));
//            xzgg.setId(sqlRowSet.getInt("id"));
//            list.add(xzgg);
//        }

//        List<Map> maps = xzggService.cesmap(sql.toString());
//        for (Map map : maps) {
//            XZGG xzgg = new XZGG();
//            xzgg.setCreateDate((Date) map.get("creatDate"));
//            xzgg.setMsg(map.get("msg").toString());
//            xzgg.setCp(map.get("cp").toString());
//            xzgg.setId((int)map.get("id"));
//            list.add(xzgg);
//        }
        List select = xzggService.select();
        list.addAll(select);
        return R.setOK("获取",JSON.toJSONString(list));
    }

    @GetMapping("/baiwei.do")
    public List<XZGG>    iffull(){
        List<XZGG>  xzgg = xzggService.iffull();
        for (XZGG xzgg1 : xzgg) {
            xzgg1.setCp(xzgg1.getCp().substring(0,3));
        }
        return xzgg;
    }
    @PostMapping("/bingjiushi.do")
    public R testSaveEntity(){
        int i = xzggService.saveEntity();
        if (i>0) {
            return R.setOK();
        }
return  R.setERROR();
    }

    @GetMapping("/cesIf.do")
    public R cesIf(){
        XZGG xzgg = new XZGG();
        xzgg.setId(4);
        xzgg =xzggService.cesIf(xzgg);
        if (xzgg != null && xzgg.getId() != 0) {
            return  R.setOK();
        }
        return R.setERROR();
    }


    @GetMapping("/cespage.do")
public PageInfo<XZGG> pageInfo(){
        PageInfo<XZGG> xzggPageInfo = xzggService.pageInfo();
        return xzggPageInfo;

    }


    public static void main(String[] args) {
        HashMap<Object, Object> map = new HashMap<>();
        map.put("id",null);
        map.put("ss","ss");
        System.out.println(JSON.toJSONString(map));
//        String s = "{\"accountCode\":\"宁波若水8888\",\"adminFlag\":\"1\",\"backCode\":\"200\",\"changePort\":\"宁波,北仑,黄埔,南港,太仓,江阴,广州新港,东江仓,上海,福清,大连,盘锦\",\"companyAddress\":\"\",\"companyFullName\":\"宁波若水供应链管理有限公司\",\"companyID\":17259,\"companyName\":\"宁波若水\",\"currentPort\":\"\",\"flag\":0,\"groupNo\":0,\"id\":0,\"incidentalType\":\"0\",\"invoiceType\":\"1\",\"monthlyCustomer\":\"false\",\"nowda\":\"2020-06-16 13:42:34.01\",\"office\":\"财务部\",\"primaryCustomer\":\"false\",\"readTreaty\":1,\"signAccountStatus\":0,\"userID\":17052,\"userName\":\"宁波若水\",\"yjc\":\"1900-01-01 00:00:00.0\",\"yjd\":\"1900-01-01 00:00:00.0\"}";

        try {
            Object o = "{\"accountCode\":\"宁波若水8888\",\"adminFlag\":\"1\"}";
            UserInfoDTO userInfoDTO = (UserInfoDTO) o;
            System.out.println(JSON.toJSONString(userInfoDTO));
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String s = "{\"accountCode\":\"宁波若水8888\",\"adminFlag\":\"1\"}";
            UserInfoDTO infoDTO = JSON.parseObject(s, UserInfoDTO.class);
            System.err.println(JSON.toJSONString(infoDTO));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
