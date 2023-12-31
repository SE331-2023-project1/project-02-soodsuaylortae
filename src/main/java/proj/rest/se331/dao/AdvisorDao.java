package proj.rest.se331.dao;

import org.springframework.data.domain.Page;
import proj.rest.se331.entity.Advisor;

public interface AdvisorDao {
    Page<Advisor> getAdvisors(Integer pageSize, Integer page);
    Advisor getAdvisor(Long id);
}
