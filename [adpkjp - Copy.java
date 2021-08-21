		 		System.out.println(sh);
		System.out.println(sh.first());
		System.out.println(sh.last());
		int z=(int) sh.first();
		int y=(int) sh.last();
		System.out.println("Addition"+(z+y));
		
		System.out.println(sh.headSet(4));
		System.out.println(sh.tailSet(4));
		System.out.println(sh.contains(2));
		System.out.println(sh.subSet(2, 5));
		
		
}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}