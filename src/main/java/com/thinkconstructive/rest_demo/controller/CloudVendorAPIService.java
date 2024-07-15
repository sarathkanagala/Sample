package com.thinkconstructive.rest_demo.controller;

import org.springframework.web.bind.annotation.*;

import com.thinkconstructive.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorAPIService {

	CloudVendor cloudVendor;

	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String VendorID) {
		// return cloudVendor;
		return new CloudVendor("C4", "Vendor 4", "Address Four", "xxx");

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
