package io.goodname01.messenger;

#import ResponseEntityExceptionHandler;
#import ExceptionHandler;
#import ResponseEntity
#import WebRequest
#			import HttpHeaders
#import HttpStatus

@ControllerAdvice
public class AppExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ Exception.class })
    protected ResponseEntity<Object> handleNotFound(
      Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Page not found!", 
          new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}
