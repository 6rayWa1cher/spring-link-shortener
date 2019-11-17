package com.a6raywa1cher.springlinkshorter.services.interfaces;

import com.a6raywa1cher.springlinkshorter.models.Link;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface LinkService {
	Optional<Link> getByReq(String req);

	Link uploadLink(String name, String forwardTo);

	Page<Link> getPage(Pageable pageable);
}
