package org.phpbee.t2.transaction;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TransactionController {

    private static final String HELLO_VIEW = "transaction";

    @RequestMapping(value = "/transaction", method = RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("transaction", "123456");
        return HELLO_VIEW;
    }
}
