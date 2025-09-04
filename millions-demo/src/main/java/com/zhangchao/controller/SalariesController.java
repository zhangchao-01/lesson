package com.zhangchao.controller;

import com.zhangchao.service.ExportService;
import com.zhangchao.service.ImportService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@RestController
public class SalariesController {

    @Resource
    private ExportService exportService;

    @Resource
    private ImportService importService;


    @GetMapping("export1")
    public void exportExcel1(HttpServletResponse response) throws IOException {
        exportService.exportExcel1(response);
    }


    @GetMapping("export2")
    public void exportExcel2(HttpServletResponse response) throws IOException {
        exportService.exportExcel2(response);
    }


    @GetMapping("export3")
    public void exportExcel3(HttpServletResponse response) throws IOException {
        exportService.exportExcel3(response);
    }

    @GetMapping("export4")
    public void exportExcel4(HttpServletResponse response) throws IOException, InterruptedException {
        exportService.exportExcel4(response);
    }

    @PostMapping("import")
    public void importExcel(MultipartFile file) throws IOException {
//        importService.importExcel(file);
        importService.importExcelAsync(file);
    }


}
