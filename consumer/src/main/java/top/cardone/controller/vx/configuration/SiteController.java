package top.cardone.controller.vx.configuration;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;
import top.cardone.configuration.service.SiteService;
import top.cardone.web.support.WebSupport;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created by yht
 */
@Log4j2
@Controller("top.cardone.controller.vx.configuration.SiteController")
@RequestMapping("/vx/configuration/site")
public class SiteController {
    /**
     * /c0001.json begin
     **/
    @RequestMapping("/c0001.json")
    @ResponseBody
    public Object c0001Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> {
                    Map<String, Object> readOne = Maps.newHashMap();

                    readOne.put("siteCode", MapUtils.getString(input, "siteCode"));

                    int count = ApplicationContextHolder.getBean(SiteService.class).readOne(Integer.class, readOne);

                    if (count > 0) {
                        throw new CodeException("该站点编号已经存在");
                    }

                    return ApplicationContextHolder.getBean(SiteService.class).insertByNotExistsCache(input);
                });
    }
    /** /c0001.json end **/

    /**
     * /c0002.json begin
     **xx/
    @RequestMapping("/c0002.json")
    @ResponseBody
    public Object c0002Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).insertByNotExistsCache(input));
    }
    /** /c0002.json end **/

    /**
     * /c0003.json begin
     **xx/
    @RequestMapping("/c0003.json")
    @ResponseBody
    public Object c0003Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).insertByNotExistsCache(input));
    }
    /** /c0003.json end **/

    /**
     * /c0004.json begin
     **xx/
    @RequestMapping("/c0004.json")
    @ResponseBody
    public Object c0004Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).insertByNotExistsCache(input));
    }
    /** /c0004.json end **/

    /**
     * /d0001.json begin
     **/
    @RequestMapping("/d0001.json")
    @ResponseBody
    public Object d0001Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).deleteByIdsCache(input));
    }
    /** /d0001.json end **/

    /**
     * /d0002.json begin
     **xx/
    @RequestMapping("/d0002.json")
    @ResponseBody
    public Object d0002Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).deleteByIdsCache(input));
    }
    /** /d0002.json end **/

    /**
     * /d0003.json begin
     **xx/
    @RequestMapping("/d0003.json")
    @ResponseBody
    public Object d0003Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).deleteByIdsCache(input));
    }
    /** /d0003.json end **/

    /**
     * /d0004.json begin
     **xx/
    @RequestMapping("/d0004.json")
    @ResponseBody
    public Object d0004Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).deleteByIdsCache(input));
    }
    /** /d0004.json end **/

    /**
     * /m0001.json begin
     **xx/
    @RequestMapping("/m0001.json")
    @ResponseBody
    public Object m0001Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOne(input));
    }
    /** /m0001.json end **/

    /**
     * /m0002.json begin
     **xx/
    @RequestMapping("/m0002.json")
    @ResponseBody
    public Object m0002Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOne(input));
    }
    /** /m0002.json end **/

    /**
     * /m0003.json begin
     **xx/
    @RequestMapping("/m0003.json")
    @ResponseBody
    public Object m0003Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOne(input));
    }
    /** /m0003.json end **/
	

    //@Value("${app.root}/upload")
    //private String uploadPath;

    /**
     * /m0004.json begin
     **xx/
    @RequestMapping("/m0004.json")
    @ResponseBody
    public Object m0004Json(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return ApplicationContextHolder.getBean(WebSupport.class).importExcel(request, response,
                (Func1<Object, List<Map<String, Object>>>) inputList -> ApplicationContextHolder.getBean(SiteService.class).insertListByNotExistsCache(Lists.newArrayList(inputList)));
    }
    /** /m0004.json end **/

    /**
     * /r0001.json begin
     **/
    @RequestMapping("/r0001.json")
    @ResponseBody
    public Object r0001Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).page(input));
    }
    /** /r0001.json end **/

    /**
     * /r0002.json begin
     **/
    @RequestMapping("/r0002.json")
    @ResponseBody
    public Object r0002Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findListByKeyword(input));
    }
    /** /r0002.json end **/

    /**
     * /r0003.json begin
     **xx/
    @RequestMapping("/r0003.json")
    @ResponseBody
    public Object r0003Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).page(input));
    }
    /** /r0003.json end **/

    /**
     * /r0004.json begin
     **xx/
    @RequestMapping("/r0004.json")
    @ResponseBody
    public Object r0004Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).page(input));
    }
    /** /r0004.json end **/

    /**
     * /u0001.json begin
     **/
    @RequestMapping("/u0001.json")
    @ResponseBody
    public Object u0001Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> {
                    Map<String, Object> readOne = Maps.newHashMap();

                    readOne.put("siteCode", MapUtils.getString(input, "siteCode"));
                    readOne.put("object_id", "siteId");

                    String dbSiteId = ApplicationContextHolder.getBean(SiteService.class).readOne(String.class, readOne);

                    if (dbSiteId != null) {
                        String siteId = MapUtils.getString(input, "siteId");

                        if (!StringUtils.equals(dbSiteId, siteId)) {
                            throw new CodeException("该站点编号已经存在");
                        }
                    }

                    return ApplicationContextHolder.getBean(SiteService.class).updateCache(input);
                });
    }
    /** /u0001.json end **/

    /**
     * /u0002.json begin
     **xx/
    @RequestMapping("/u0002.json")
    @ResponseBody
    public Object u0002Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).updateCache(input));
    }
    /** /u0002.json end **/

    /**
     * /u0003.json begin
     **xx/
    @RequestMapping("/u0003.json")
    @ResponseBody
    public Object u0003Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).updateCache(input));
    }
    /** /u0003.json end **/

    /**
     * /u0004.json begin
     **xx/
    @RequestMapping("/u0004.json")
    @ResponseBody
    public Object u0004Json(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).updateCache(input));
    }
    /** /u0004.json end **/

    /**
     * /addModal.json begin
     **xx/
    @RequestMapping("/addModal.json")
    @ResponseBody
    public Object addModalJson(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOneBySiteId(input));
    }
    /** /addModal.json end **/

    /**
     * /modifyModal.json begin
     **/
    @RequestMapping("/modifyModal.json")
    @ResponseBody
    public Object modifyModalJson(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOneBySiteId(input));
    }
    /** /modifyModal.json end **/

    /**
     * /index.json begin
     **xx/
    @RequestMapping("/index.json")
    @ResponseBody
    public Object indexJson(HttpServletRequest request) {
        return ApplicationContextHolder.getBean(WebSupport.class).func(request,
                (Func1<Object, Map<String, Object>>) input -> ApplicationContextHolder.getBean(SiteService.class).findOneBySiteId(input));
    }
    /** /index.json end **/
}