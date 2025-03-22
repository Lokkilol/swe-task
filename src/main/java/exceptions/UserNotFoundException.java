package exceptions;

import util.GlobalConstants;

public class UserNotFoundException extends Exception {
  String e;

  UserNotFoundException() {
    e = GlobalConstants.UserNotFoundExceptionString;
  }

}
