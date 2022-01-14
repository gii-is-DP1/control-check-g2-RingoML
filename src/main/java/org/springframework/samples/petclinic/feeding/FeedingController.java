package org.springframework.samples.petclinic.feeding;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.pet.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeedingController {
    
	@Autowired
	private FeedingService feedingService;
	@Autowired
	private PetService petService;
	
	private static final String VIEWS_FEEDING_CREATE_OR_UPDATE_FORM = "feedings/createOrUpdateFeedingForm";
	
	@GetMapping(value = "/feeding/create")
	public String initCreationForm(ModelMap modelMap) {
		modelMap.addAttribute("feeding", new Feeding());
		modelMap.addAttribute("feedingTypes", feedingService.getAllFeedingTypes());
		modelMap.addAttribute("pets", petService.getAllPets());
		return VIEWS_FEEDING_CREATE_OR_UPDATE_FORM;
	}
	
//	@PostMapping(value = "/feeding/create")
//	public String processCreationForm(@Valid Feeding feeding, BindingResult result, ModelMap modelMap) {
//		String view = "welcome";
//		if (result.hasErrors()) {
//			modelMap.addAttribute("feeding", feeding);
//			modelMap.addAttribute("feedingTypes", feedingService.getAllFeedingTypes());
////			modelMap.addAttribute("pets", petService.getAllPets());
//			return VIEWS_FEEDING_CREATE_OR_UPDATE_FORM;
//		}
//		else {
//			//creating product
//			try {
//				feedingService.save(feeding);
//			} catch (UnfeasibleFeedingException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			modelMap.addAttribute("message", "Product succesfully saves!");
//		}
//		return view;
//	}
}
