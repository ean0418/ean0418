package com.ean.jul091.error;

import java.util.List;

public interface ErrorMapper {
	public abstract List<Error> getAllError();
	public abstract List<Error> searchError(Error e);
	
}