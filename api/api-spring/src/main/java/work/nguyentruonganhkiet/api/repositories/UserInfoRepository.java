package work.nguyentruonganhkiet.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import work.nguyentruonganhkiet.api.model.entities.UserInfo;

public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Long> {
}
