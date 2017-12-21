package edu.mum.cs544.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.cs544.dao.ResourceDAO;
import edu.mum.cs544.domain.Resource;

@Service
public class ResourceService implements IResourceService {
	
	@Autowired
    private ResourceDAO resourceDao;

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void addResource(Resource resource) {
		resourceDao.save(resource);
	}

	public void deleteResource(int resourceId) {
		resourceDao.deleteById(resourceId);
	}

	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public void updateResource(Resource resource) {
		resourceDao.save(resource);

	}

	public Collection<Resource> getResources() {
		
		return resourceDao.findAll();
	}

	public Resource getResource(int resourceId) {
		return resourceDao.findById(resourceId);
	}

}
