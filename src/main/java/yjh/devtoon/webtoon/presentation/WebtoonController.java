package yjh.devtoon.webtoon.presentation;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import yjh.devtoon.common.response.Response;
import yjh.devtoon.webtoon.application.WebtoonService;
import yjh.devtoon.webtoon.dto.request.WebtoonCreateRequest;
import yjh.devtoon.webtoon.dto.response.WebtoonResponse;

@RequestMapping("/v1/webtoons")
@RequiredArgsConstructor
@RestController
public class WebtoonController {

    private final WebtoonService webtoonService;

    /**
     * 웹툰 등록
     */
    @PostMapping
    public ResponseEntity<Response> registerWebtoon(
            @RequestBody @Valid final WebtoonCreateRequest request
    ) {
        webtoonService.createWebtoon(request);
        return ResponseEntity.ok(Response.success(null));
    }

    /**
     * 웹툰 조회
     */
    @GetMapping("/{id}")
    public ResponseEntity<Response> retrieve(
        @PathVariable final Long id
    ) {
        WebtoonResponse webtoonResponse = webtoonService.retrieve(id);
        return ResponseEntity.ok(Response.success(webtoonResponse));
    }

}
