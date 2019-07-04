package com.rest.fileupload.juit.test;

import com.rest.fileupload.controller.PhoneBookRestController;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.fileUpload;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class FileResourceTest {

  /*  private MockMvc mockMvc;

    @Rule
    public TemporaryFolder folder = new TemporaryFolder();

    @Before
    public void setUp() throws Exception {
        String uploadPath = folder.getRoot().getAbsolutePath();
        mockMvc = MockMvcBuilders
                .standaloneSetup(new PhoneBookRestController(uploadPath))
                .build();
    }

    @Test
    public void should_upload_image_to_upload_path() throws Exception {
        MockMultipartFile file = new MockMultipartFile("file", "hello.txt", MediaType.TEXT_PLAIN_VALUE, "Hello, World!".getBytes());
        mockMvc.perform(fileUpload("/api/files").file(file))
                .andDo(print())
                .andExpect(status().isCreated());
        (folder.getRoot().toPath().resolve("hello.txt")).exists();
    }*/
}
