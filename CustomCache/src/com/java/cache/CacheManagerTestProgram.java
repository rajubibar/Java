package com.java.cache;

/**
* Title:        Caching
* Description:  A test program for the CacheManager
* Copyright:    Copyright (c) 2001
* Company:
* Filename: CacheManagerTestProgram.java
* @author Jonathan Lurie
* @version 1.0
*/
public class CacheManagerTestProgram {
  public CacheManagerTestProgram() {
  }
  public static void main(String[] args) {
    CacheManagerTestProgram cacheManagerTestProgram1 = new
CacheManagerTestProgram();
    /* This is the object that we are going to cache.  Admittedly this is a
       trivial object to cache.  You might replace our alphabet with a list
of every character in the
       world.
    */
    String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    /* Create an instance of CachedObject, set the minutesToLive to 1
minute.  Give the
       object some unique identifier.
    */
    CachedObject co = new CachedObject(s, new Long(1234), 1);
    /* Place the object into the cache! */
    CacheManager.putCache(co);
    /* Try to retrieve the object from the cache! */
    CachedObject o = (CachedObject)CacheManager.getCache(new Long(1234));
    /* Let's see if we got it! */
    if (o == null)
      System.out.println("CacheManagerTestProgram.Main:  FAILURE!  Object not Found.");
    else
      System.out.println("CacheManagerTestProgram.Main:  SUCCESS! " +
((String)o.object).toString());
  }
}
//This test program creates an object, places it into the cache with a one-minute time-to-live, and tests to see whether it is retrieved from the cache when requested. When you run the program, you want to keep an eye on your output console; you should see the threadCleanerUpper putting out messages every five seconds. After one minute, you'll notice that it cleans out the object placed in the cache. Your CacheManager is up and running!

//For the bold and courageous, I encourage you to identify the needs of your system and ask yourself how you identify your objects in the cache. Can you identify objects