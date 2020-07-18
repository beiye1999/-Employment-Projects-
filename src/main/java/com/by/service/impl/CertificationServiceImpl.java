package com.by.service.impl;

import com.by.dao.CertificationMapper;
import com.by.pojo.Certification;
import com.by.service.CertificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CertificationServiceImpl implements CertificationService {

    @Autowired
    private CertificationMapper certificationMapper;

    @Override
    public void insert(Certification cer) {
        certificationMapper.insert(cer);
    }
}
