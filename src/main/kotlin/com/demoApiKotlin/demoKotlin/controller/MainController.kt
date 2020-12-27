package com.demoApiKotlin.demoKotlin.controller

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

@RestController
@RequestMapping("/api/Main")
class MainController {
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/demo",produces = ["application/json"])
    fun findAll(httpServletRequest: HttpServletRequest, httpServletResponse: HttpServletResponse) :String {
        try {
          return "";
        }catch (e : Exception) {
            httpServletResponse.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR , e.message);
            return "null"
        }
    }

    @RequestMapping(HttpStatus.OK)
    @GetMapping("/dataMockup")
    fun getDataMockup(httpServletRequest: HttpServletRequest,httpServletResponse: HttpServletResponse): List<JvmType.Object>{

    }
}