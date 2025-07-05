package br.com.fortes.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String msg, String details) {

}
