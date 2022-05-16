package com.nakwon.web;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nakwon.domain.MenuVO;
import com.nakwon.service.ReservationHoldService;

@Controller
@RequestMapping("/project/manager/reservation/*")
public class ReservationController {
	@Inject
	private ReservationHoldService reservationholdservice;
	
	//예약 등록 GET
	/*
	 * @RequestMapping(value="/menuAdd", method=RequestMethod.GET) public void
	 * menuAddGET(MenuVO vo, Model model) throws Exception{
	 * System.out.println("MenuVO GET Called"); model.addAttribute("list",
	 * reservationholdservice.menuListAll()); }
	 * 
	 * //예약 등록 POST
	 * 
	 * @RequestMapping(value="/menuAdd", method=RequestMethod.POST) public void
	 * menuAddPOST(MenuVO vo, Model model) throws Exception {
	 * System.out.println("MenuVO POST Called"); reservationholdservice.insert(vo);
	 * }
	 */

}
