package com.tutor.yepp.service;


import com.tutor.yepp.Repositoryes.PostOfficeRepository;
import com.tutor.yepp.models.PostOffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostOfficeService {

    @Autowired
    private PostOfficeRepository postOfficeRepository;

    public PostOffice addPostOffice(PostOffice postOffice){
        return postOfficeRepository.save(postOffice);
    }

    public void deletePostOffice(String index){
        postOfficeRepository.deleteById(index);
    }

    public Optional<PostOffice> getPostOfficeById(String index){
        return postOfficeRepository.findById(index);
    }

    public List<PostOffice> getAllOffices(){
        return postOfficeRepository.findAll();
    }

    public PostOfficeService(PostOfficeRepository postOfficeRepository) {
        this.postOfficeRepository = postOfficeRepository;
    }
}
