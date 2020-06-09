package br.com.mnr.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import br.com.mnr.controllers.AlunoController;
import br.com.mnr.daos.AlunoDAO;
import br.com.mnr.services.AlunoService;

@Configuration
@ComponentScan(basePackageClasses={Boot.class, AlunoController.class, AlunoService.class, AlunoDAO.class})
public class ServletInitializer extends org.springframework.boot.web.servlet.support.SpringBootServletInitializer{
	
}
