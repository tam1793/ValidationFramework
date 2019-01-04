/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.controller;

import ValidationResult.ValidationResult;
import Validator.Validator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import core.controller.ApiServlet;
import core.utilities.CommonUtil;
import app.service.DemoService;
import classdemo.ClassDemo.User;
import org.apache.log4j.Logger;

/**
 *
 * @author tamnnq
 */
public class DemoApiController extends ApiServlet {

    private final Logger logger = Logger.getLogger(DemoApiController.class);

    @Override
    protected Object execute(HttpServletRequest req, HttpServletResponse resp) {
        try {

            return controllerAPI(req);

        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        return null;
    }

    private Object controllerAPI(HttpServletRequest req) {
        try {
            User user = CommonUtil.jsonToObject(req.getParameter("object"), User.class);
            Validator validator = Validator.getInstance();
            ValidationResult validate = validator.validate(user);

            // When data is valid
            if (validate.getIsValid()) {
                DemoService.getInstance().doWhenDataIsValid(user);
            }
            return validate;
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
        }
        return null;
    }

}
