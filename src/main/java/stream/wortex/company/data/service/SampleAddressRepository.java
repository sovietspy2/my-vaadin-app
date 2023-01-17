package stream.wortex.company.data.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import stream.wortex.company.data.entity.SampleAddress;

public interface SampleAddressRepository
        extends
            JpaRepository<SampleAddress, Long>,
            JpaSpecificationExecutor<SampleAddress> {

}
