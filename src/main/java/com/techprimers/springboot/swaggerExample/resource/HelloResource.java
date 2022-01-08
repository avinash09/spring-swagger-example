package com.techprimers.springboot.swaggerExample.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "Hello Resources",description = "Uses to process user records")
public class HelloResource {

	@ApiOperation(value="Return the Hello World.")
	@ApiResponses(
			value={
				   @ApiResponse(code=100,message="information message"),
				   @ApiResponse(code=500,message="Interanl server error")
				  }
	)

	@GetMapping
	public String hello() {
		return "Hello World";
	}

	@ApiOperation(value="Save the messages")
	@PostMapping("/post")
	public String helloPost(@RequestBody final String hello) {
		return hello;
	}

	@ApiOperation(value="updated the messages.")
	@PutMapping("/put")
	public String helloPut(@RequestBody final String hello) {
		return hello;
	}

}
