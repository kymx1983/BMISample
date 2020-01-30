package bmiSample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import bmiSample.utils.BMIUtil;

/**
 * BMIController
 * @author 
 *
 */
@Controller
public class BMIController {

	/**
	 * 
	 * @return model
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView model = new ModelAndView();
		model.setViewName("index");
		return model;
	}

	/**
	 * 
	 * @param height
	 * @param weight
	 * @return model
	 */
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ModelAndView form(@RequestParam("height") double height, @RequestParam("weight") double weight) {
		ModelAndView model = new ModelAndView();

		// BMIの計算
		double bmi = BMIUtil.calcBMI(height, weight);
		model.addObject("bmi", bmi);

		// BMI判定
		model.addObject("judge", BMIUtil.judgeBMI(bmi));
		
		model.setViewName("result");
		return model;
	}


}