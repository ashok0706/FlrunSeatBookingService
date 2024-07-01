package com.example.BookingService.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.BookingService.Model.DataSheat;

@Repository
public interface dataSheatRepo extends JpaRepository<DataSheat, Integer> {

//	@Query(value = "**select * from DataSheat ds**",nativeQuery = true)
	DataSheat findAllBySeatId(String sr);

//	@Query(value = "**select * from DataSheat ds**",nativeQuery = true)
	DataSheat findFirstBySeatId(String sr);

}
