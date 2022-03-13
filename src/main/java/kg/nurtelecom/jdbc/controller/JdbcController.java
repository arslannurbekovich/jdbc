package kg.nurtelecom.jdbc.controller;

import kg.nurtelecom.jdbc.model.SubsModel;
import kg.nurtelecom.jdbc.service.SubsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class JdbcController {

    private final SubsService subsService;

    public JdbcController(SubsService subsService) {
        this.subsService = subsService;
    }

    @PostMapping(path = "/create")
    public String saveSubs(@RequestBody SubsModel subsModel){
        subsService.save(subsModel);
        return null;
    }
}
