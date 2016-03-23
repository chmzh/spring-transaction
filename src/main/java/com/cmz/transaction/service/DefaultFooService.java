package com.cmz.transaction.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmz.transaction.domain.Foo;

@Transactional
public class DefaultFooService implements FooService {
	public Foo getFoo(String fooName) {
		throw new UnsupportedOperationException();
		//System.out.println(fooName);
		//return null;
	}

	public Foo getFoo(String fooName, String barName) {
		throw new UnsupportedOperationException();
	}

	public void insertFoo(Foo foo) {
		throw new UnsupportedOperationException();
	}

	public void updateFoo(Foo foo) {
		throw new UnsupportedOperationException();
	}
}
