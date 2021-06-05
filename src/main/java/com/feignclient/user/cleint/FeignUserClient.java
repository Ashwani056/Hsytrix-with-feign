package com.feignclient.user.cleint;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.feignclient.user.Model;

@FeignClient(url="https://coronavirus-19-api.herokuapp.com",name="FEIGN")
public interface FeignUserClient {
	
	@GetMapping("/countries")
	public List<Model> getCovidData();

}
