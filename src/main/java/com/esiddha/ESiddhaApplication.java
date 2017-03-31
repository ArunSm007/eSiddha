package com.esiddha;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;
import com.esiddha.entities.LoginDetails;
import com.esiddha.entities.PatientDetails;
import com.esiddha.entities.PersonalDetails;

@SuppressWarnings("deprecation")
@SpringBootApplication(scanBasePackages={"com.esiddha.*"})
@EntityScan(basePackageClasses={LoginDetails.class,DoctorDetails.class,PatientDetails.class,PersonalDetails.class,AppointmentDetails.class,AvailabilityDetails.class})
public class ESiddhaApplication extends SpringBootServletInitializer{
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ESiddhaApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ESiddhaApplication.class, args);
	}
}
