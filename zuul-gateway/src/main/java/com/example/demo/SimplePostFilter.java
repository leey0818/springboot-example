package com.example.demo;

import javax.servlet.http.HttpServletResponse;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

public class SimplePostFilter extends ZuulFilter
{
    public SimplePostFilter() {}

    @Override
    public boolean shouldFilter()
    {
        return true;
    }

    @Override
    public String filterType()
    {
        return "post";
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
        HttpServletResponse response = ctx.getResponse();
        
        System.out.println(String.format("HttpResponse : %s", response.getStatus()));
        
        return null;
    }

}
