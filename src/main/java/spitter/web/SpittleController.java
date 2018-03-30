package spitter.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import spitter.pojo.Spittle;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author rain
 * created on 2018/3/30
 */
@Controller
@RequestMapping(value = "spittles")
public class SpittleController {
    private List<Spittle> createSpittleList(int count) {
        List<Spittle> spittles = new ArrayList<>(16);
        for (int i = 0;i < count;i ++) {
            spittles.add(new Spittle("Spittle" + i, new Date()));
        }
        return spittles;
    }

    /**
     * @RequestParam 请求中的查询参数
     *  defaultValue默认值，在没有接收到任何参数时
     * @param model
     * @param count
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public String spittles(Model model, @RequestParam(value = "count", defaultValue = "20") int count) {
        model.addAttribute(createSpittleList(count));
        return "spittles";
    }

    /**
     * 面向资源方式与请求参数的差异之处
     * @param spittle
     * @param model
     * @return
     */
    @RequestMapping(value = "/{spittleId}", method = RequestMethod.GET)
    public String spittle(@PathVariable("spittleId") Long spittle, Model model) {
        model.addAttribute(createSpittleList(1).get(0));
        return "spittle";
    }
}