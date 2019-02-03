package com.admin.demo.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.post.SendErrorFilter;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ERROR_TYPE;

/**
 * 异常处理过滤器
 * Created by abao on 2017/7/12.
 */
@Component
public class ErrorFilter extends SendErrorFilter {

    private static Logger log = LoggerFactory.getLogger(ErrorFilter.class);

    @Override
    public String filterType() {
        return ERROR_TYPE;
    }

    @Override
    public int filterOrder() {
        return 30;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    /*@Override
    public Object run() {
        RequestContext ctx = RequestContext. getCurrentContext () ;
        Throwable throwable = ctx. getThrowable () ;

        log.error ("this is a Error Filter : {} ", throwable.getCause().getMessage());

        ctx.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
        ctx.set("error.exception", throwable.getCause());


        return null;
    }*/
}
