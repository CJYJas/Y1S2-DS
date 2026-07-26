INCLUDE Irvine32.inc

.data
; Word elements require 2 bytes each
myArray WORD 0, 2, 5, 9, 10
gapsSum DWORD 0

.code
main PROC
    mov edx, 0          ; Clear EDX to hold our running total of gaps
    mov esi, 0          ; ESI will be our index pointer (starts at 0)

    ; Gap 1: 2 - 0
    mov ax, myArray[esi + 2]   ; Get 2
    sub ax, myArray[esi]       ; Subtract 0
    movzx ecx, ax              ; Move to 32-bit register with zero-extend
    add edx, ecx               ; Accumulate into EDX
    add esi, 2                 ; Move index to the next WORD element

    ; Gap 2: 5 - 2
    mov ax, myArray[esi + 2]   ; Get 5
    sub ax, myArray[esi]       ; Subtract 2
    movzx ecx, ax
    add edx, ecx
    add esi, 2

    ; Gap 3: 9 - 5
    mov ax, myArray[esi + 2]   ; Get 9
    sub ax, myArray[esi]       ; Subtract 5
    movzx ecx, ax
    add edx, ecx
    add esi, 2

    ; Gap 4: 10 - 9
    mov ax, myArray[esi + 2]   ; Get 10
    sub ax, myArray[esi]       ; Subtract 9
    movzx ecx, ax
    add edx, ecx

    ; Save final sum into memory and display registers to match lab output
    mov gapsSum, edx
    call DumpRegs       ; Displays EAX, EBX, ECX, EDX etc. on screen
    
    exit
main ENDP
END main