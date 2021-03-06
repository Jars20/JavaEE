import club.banyuan.dao.IOrderDao;
import club.banyuan.dao.IOrderDetailDao;
import club.banyuan.dao.IUserDao;
import club.banyuan.dao.impl.IOrderDaoImpl;
import club.banyuan.dao.impl.IOrderDetailDaoImpl;
import club.banyuan.dao.impl.UserDaoImpl;
import club.banyuan.entity.Order;
import club.banyuan.entity.Order_Detail;
import club.banyuan.entity.User;
import club.banyuan.util.JdbcUtils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

//一、准备工作
//1、导入jdbc的jar
//2、复制util/jdbcUtil，dao/IBaseDao、dao/impl/BaseDaoImpl到各自包下
//3、复制配置文件db.properties到src目录
//二、自定义dao
//1、在dao包下创建自定义接口（继承通用BaseDao接口）
//2、在dao/impl下创建自定义接口的实现类
//        以及继承通用接口的实现类BaseDaoImpl
//3、实现自定义接口中的方法


public class TestMain {
    public static void main(String[] args) throws IOException, SQLException {
//        Properties properties = new Properties();
//        InputStream is = TestMain.class.getClassLoader()
//                            .getResourceAsStream("db.properties");
//        properties.load(is);
//        String url = properties.getProperty("URL");
//        String username = properties.getProperty("USERNAME");
//        String pwd = properties.getProperty("PWD");

//        System.out.println(url+"  "+username+"  "+pwd);

        Connection conn = JdbcUtils.getConnection();
        IUserDao IUserDao = new UserDaoImpl(conn);


//        IOrderDao iOrderDao =new IOrderDaoImpl(conn);
//        Order order = iOrderDao.show("fsfsfsf");
//        System.out.println(order);

//        IOrderDetailDao iOrderDetailDao = new IOrderDetailDaoImpl(conn);
//        Order_Detail order_detail= iOrderDetailDao.show(1);
//        System.out.println(order_detail);
        User newUser = new User(null,"kkkk","realName","123",1,"dfs@sdf.com","12345666673");
        int id = IUserDao.add(newUser);
        System.out.println(id);
    }
}
