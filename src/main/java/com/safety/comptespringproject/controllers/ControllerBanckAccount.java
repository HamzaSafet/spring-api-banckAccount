package com.safety.comptespringproject.controllers;

import com.safety.comptespringproject.entities.BancAcount;
import com.safety.comptespringproject.repositories.BancAcountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class ControllerBanckAccount {
    @Autowired
    private BancAcountRepo bancAcountRepo;

    @GetMapping(path = "/all")
    public List<BancAcount> getAllAccount(){
        return bancAcountRepo.findAll();
    }
    @PostMapping(path = "/add")
    public BancAcount addAccount(@RequestBody BancAcount bancAcount){
        return bancAcountRepo.save(bancAcount);
    }

    @PutMapping("/update")
    public BancAcount updateAccount(@RequestBody BancAcount bancAcount){
        BancAcount bancAcountupdate=bancAcountRepo.findById(bancAcount.getAccountId()).orElse(null);

        if (bancAcountupdate!=null){
            bancAcountupdate.setCurrency(bancAcount.getCurrency());
            bancAcountupdate.setBalance(bancAcount.getBalance());
            bancAcountupdate.setStatus(bancAcount.getStatus());
            bancAcountupdate.setNumeroCompte(bancAcount.getNumeroCompte());
            bancAcountRepo.save(bancAcountupdate);
            return bancAcountupdate;
        }else {
            return null;
        }

    }

    @DeleteMapping("/deleted/{id}")
    public String deleteAccount(@PathVariable long id){
        if (bancAcountRepo.existsById(id)){
            bancAcountRepo.deleteById(id);
            return "deleted";
        }
        return "this account is not existed ..!";

    }
    @GetMapping("/find/{id}")
    public BancAcount getAccountById(@PathVariable long id){
        return bancAcountRepo.findById(id).get();
    }

}