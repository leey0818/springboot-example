package com.example.demo.filter;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SimplePreFilter extends ZuulFilter
{
    public SimplePreFilter() {}

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public String filterType()
    {
        return "pre";
    }

    @Override
    public int filterOrder()
    {
        return 0;
    }

    @Override
    public Object run() throws ZuulException
    {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        
        System.out.println(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));
        
        return null;
    }
}
