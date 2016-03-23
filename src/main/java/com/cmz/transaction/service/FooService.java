package com.cmz.transaction.service;

import com.cmz.transaction.domain.Foo;

public interface FooService {
	public Foo getFoo(String fooName);

	public Foo getFoo(String fooName, String barName);

	public void insertFoo(Foo foo);

	public void updateFoo(Foo foo);
}
