package com.xworkz.job.repository;

import com.xworkz.job.dto.JobDTO;

public interface JobRepo {

	boolean save(JobDTO dto);
}
