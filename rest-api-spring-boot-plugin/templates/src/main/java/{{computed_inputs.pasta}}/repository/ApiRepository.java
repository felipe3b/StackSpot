package {{computed_inputs.package_name}}.repository;

import {{computed_inputs.package_name}}.model.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApiRepository extends JpaRepository<Api, Long> {
}