package com.bill.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/bill")
public class BillResource {
	@GetMapping
	public String Welcome() {
		return "programming billing services";
	}

}
