package ie.atu.address;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/address")
@RestController
public class AddressController {

    private AddressService addressService;



    @PostMapping("create")
    public ResponseEntity<String> postAddress(@Valid @RequestBody Address address){
        addressService.postAddress(address);
        return new ResponseEntity<>("Address posted succesfully " + address, HttpStatus.OK);
    }
}
