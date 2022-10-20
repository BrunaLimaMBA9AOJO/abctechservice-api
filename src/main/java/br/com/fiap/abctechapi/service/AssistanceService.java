package br.com.fiap.abctechapi.service;


import br.com.fiap.abctechapi.model.Assistance;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AssistanceService {
    List<Assistance> getAssistanceList();
}