package edu.mum.cs544.service;

import java.util.Collection;

import edu.mum.cs544.domain.Resource;

public interface IResourceService {
	
	public void addResource(Resource resource);
	public void deleteResource(int resourceId);
	public void updateResource(Resource resource);
	public Collection<Resource> getResources();
	public Resource getResource(int resourceId);

}
