package com.esiddha;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

import com.esiddha.entities.AppointmentDetails;
import com.esiddha.entities.AvailabilityDetails;
import com.esiddha.entities.DoctorDetails;
import com.esiddha.entities.LoginDetails;
import com.esiddha.entities.PatientDetails;
import com.esiddha.entities.PersonalDetails;
import com.esiddha.services.LoginServiceImpl;

@SpringBootApplication(scanBasePackages={"com.esiddha.*"})
@EntityScan(basePackageClasses={LoginDetails.class,DoctorDetails.class,PatientDetails.class,PersonalDetails.class,AppointmentDetails.class,AvailabilityDetails.class})
public class ESiddhaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ESiddhaApplication.class, args);
	}
}
