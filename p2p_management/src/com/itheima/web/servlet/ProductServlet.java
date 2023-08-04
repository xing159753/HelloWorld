package com.itheima.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.alibaba.fastjson.JSONObject;
import com.itheima.domain.Product;
import com.itheima.service.IProductService;
import com.itheima.service.impl.ProductServiceImpl;

public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String method = request.getParameter("method");

        if ("findAll".equals(method)) {
            findAll(request, response);
        }
        if ("add".equals(method)) {
            add(request, response);
        }
        if ("findById".equals(method)) {
            findById(request, response);
        }

        if ("update".equals(method)) {
            update(request, response);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.将请求参数封装到bean
        Product p = new Product();
        try {
            BeanUtils.populate(p, request.getParameterMap());
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        // 2.调用service完成修改操作
        IProductService productService = new ProductServiceImpl();
        productService.update(p);

    }

    public void findById(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 1.得到产品id
        int id = Integer.parseInt(request.getParameter("id"));

        // 2.调用service根据id查询
        IProductService productService = new ProductServiceImpl();
        Product p = productService.findById(id);

        // 3.将p转换成json响应到浏览器

        response.getWriter().write(JSONObject.toJSONString(p));

    }

    // 添加产品
    public void add(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.得到请求参数,将数据封装到bean中
        Product p = new Product();

        try {

            BeanUtils.populate(p, request.getParameterMap());

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        // 2.调用service中方法完成添加操作
        IProductService productService = new ProductServiceImpl();
        productService.add(p);

    }

    // 查询所有产品方法
    public void findAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 调用service获取所有产品信息
        IProductService productService = new ProductServiceImpl();
        List<Product> ps = productService.findAll();

        // 将ps转换成json响应到浏览器
        String jsonValue = JSONObject.toJSONString(ps);

        response.getWriter().write(jsonValue);

    }

}
