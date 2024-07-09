package com.thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thinkconstructive.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {

	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String VendorID) {
		// return cloudVendor;
		return new CloudVendor("C3", "Vendor 3", "Address Three", "xxxx");

	}

	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Created Successfully";
	}

	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "Cloud Vendor Updated Successfully";
	}

	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "Cloud Vendor Deleted Successfully";
	}

}
