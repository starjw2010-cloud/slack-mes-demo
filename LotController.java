@RestController
@RequestMapping("/api/lot")
public class LotController {

    @PostMapping("/update")
    public ResponseEntity<?> updateLot(@RequestBody Map<String, Object> body) {
        String lotId = (String) body.get("lotId");
        // TODO: validation 없음
        lotRepository.update(lotId, body);
        return ResponseEntity.ok("updated");
    }
}
