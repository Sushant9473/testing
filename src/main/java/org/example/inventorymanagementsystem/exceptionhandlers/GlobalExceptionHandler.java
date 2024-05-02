package org.example.inventorymanagementsystem.exceptionhandlers;

import org.example.inventorymanagementsystem.dtos.ExceptionDto;
import org.example.inventorymanagementsystem.exceptions.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(InvalidItemUpdateException.class)
    public ResponseEntity<ExceptionDto> handleInvalidItemUpdateException(InvalidItemUpdateException invalidItemUpdateException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(invalidItemUpdateException.getMessage());
        dto.setResolution("InvalidItemUpdateException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(InvalidTransactionIdException.class)
    public ResponseEntity<ExceptionDto> handleInvalidTransactionIdException(InvalidTransactionIdException invalidTransactionIdException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(invalidTransactionIdException.getMessage());
        dto.setResolution("InvalidTransactionIdException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(InvalidSupplierItemsException.class)
    public ResponseEntity<ExceptionDto> handleInvalidSupplierItemsException(InvalidSupplierItemsException invalidSupplierItemsException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(invalidSupplierItemsException.getMessage());
        dto.setResolution("InvalidSupplierItemsException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(InvalidSupplierUpdateException.class)
    public ResponseEntity<ExceptionDto> handleInvalidSupplierUpdateException(InvalidSupplierUpdateException invalidSupplierUpdateException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(invalidSupplierUpdateException.getMessage());
        dto.setResolution("InvalidSupplierUpdateException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }

    @ExceptionHandler(ItemNotFoundException.class)
    public ResponseEntity<ExceptionDto> handleItemNotFoundException(ItemNotFoundException itemNotFoundException) {
        ExceptionDto dto = new ExceptionDto();
        dto.setMessage(itemNotFoundException.getMessage());
        dto.setResolution("ItemNotFoundException caught");
        ResponseEntity<ExceptionDto> response = new ResponseEntity<>(dto, HttpStatus.BAD_REQUEST);
        return response;
    }
}
