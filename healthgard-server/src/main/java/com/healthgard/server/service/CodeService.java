package com.healthgard.server.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.healthgard.server.domain.common.Code;
import com.healthgard.server.domain.common.CodeRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CodeService {
	
	private final CodeRepository codeRepository;

	@Transactional
	public List<Code> findAllByUpperCode(String upperCode){

		List<Code> codeList = codeRepository.findAllByUpperCode(upperCode);
		return codeList;
	}
}
